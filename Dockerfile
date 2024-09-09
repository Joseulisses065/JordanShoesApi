FROM ubuntu:latest
LABEL authors="ulisses"

ENTRYPOINT ["top", "-b"]