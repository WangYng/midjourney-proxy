#!/usr/bin/env bash

echo "\033[31mremove midjourney-proxy-slow container \033[0m"
docker rm -f midjourney-proxy-slow

echo "\033[31mremove midjourney-proxy-slow image \033[0m"
docker image rm midjourney-proxy-slow

echo "\033[32mbuild midjourney-proxy-slow image \033[0m"
docker build --tag midjourney-proxy-slow ..

echo "\033[32mrun midjourney-proxy-slow container \033[0m"
docker run --name midjourney-proxy-slow -d -p 8084:8080 midjourney-proxy-slow
