FROM	  	  fedora:latest

RUN         dnf upgrade --assumeyes
RUN         dnf install python2 --assumeyes
RUN         ln -sfn /usr/bin/python2 /usr/bin/python
RUN         dnf install java-1.8.0-openjdk --assumeyes
RUN         dnf install java-1.8.0-openjdk-devel --assumeyes
RUN         dnf install java-1.8.0-openjdk-openjfx --assumeyes
RUN         dnf install java-1.8.0-openjdk-openjfx-devel --assumeyes
RUN         dnf install procps --assumeyes

WORKDIR	  	/app
COPY		    . /app/
RUN         touch non-existing-file

#ENTRYPOINT  ["/bin/bash", "-c", ". main.sh 1 classes_jabref.csv 2 60 20 1"]
ENTRYPOINT    ["./docker_main.sh"]
