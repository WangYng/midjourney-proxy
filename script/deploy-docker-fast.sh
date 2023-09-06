#!/usr/bin/env bash

echo "\033[31mremove midjourney-proxy-fast container \033[0m"
docker rm -f midjourney-proxy-fast

echo "\033[31mremove midjourney-proxy-fast image \033[0m"
docker image rm midjourney-proxy-fast

echo "\033[32mbuild midjourney-proxy-fast image \033[0m"
docker build --tag midjourney-proxy-fast ..

echo "\033[32mrun midjourney-proxy-fast container \033[0m"
docker run --name midjourney-proxy-fast -d -p 8080:8080 midjourney-proxy-fast
