import os
import requests
import xml.etree.ElementTree as ElementTree
import subprocess
import shutil
import sys

root_path = os.path.abspath(os.path.join(os.path.dirname(os.path.realpath(__file__)), os.pardir))
temp_path = os.path.join(root_path, "temp_icons")
drawable_path = os.path.join(root_path, "bezier/src/main/res/drawable")


def remove_temp_directory():
    if os.path.isdir(temp_path):
        shutil.rmtree(temp_path)


def is_tool(name):
    return shutil.which(name) is not None


def download_file(url, filename):
    with requests.get(url, stream=True) as r:
        r.raise_for_status()
        with open(os.path.join(temp_path, filename), 'wb') as f:
            for chunk in r.iter_content(chunk_size=8192):
                f.write(chunk)


def download_icon_set():
    if not is_tool("vd-tool"):
        print("Please install vd-tool >> npm install -g vd-tool")
        exit(0)

    if "FIGMA_ACCESS_TOKEN" not in os.environ:
        print("Set FIGMA_ACCESS_TOKEN please")
        exit(0)

    node_request_url = "https://api.figma.com/v1/files/99k33ZxchcPKTz2tzJlZeE/nodes?ids=2775-2538"
    headers = { "x-figma-token": os.environ['FIGMA_ACCESS_TOKEN'] }

    r = requests.get(url=node_request_url, headers=headers).json()

    if  'status' in r and r['status'] != 200:
        print(f'Something wrong: {r}')
        sys.exit(1)

    components = r["nodes"]["2775:2538"]["components"]
    ids = ",".join(components.keys())

    image_request_url = f"https://api.figma.com/v1/images/99k33ZxchcPKTz2tzJlZeE?ids={ids}&format=svg"

    r = requests.get(url=image_request_url, headers=headers).json()
    images = r["images"]

    count = 0
    total = len(images)

    os.mkdir(temp_path)

    for key, url in images.items():
        icon_name = components[key]["name"].replace('-', '_')
        count += 1

        print(f"({count} / {total}) {key} {url} {icon_name}")

        download_file(url, f"icon_{icon_name}.svg")

    subprocess.call(["vd-tool", "-c", "-in", temp_path, "-out", drawable_path])

remove_temp_directory()
download_icon_set()
remove_temp_directory()
