#!/bin/bash


sudo apt update
sudo apt install openjdk-21-jdk -y


java -version

echo "Программа завершена"
echo "Пробую запустить сервер"

bash start.sh
