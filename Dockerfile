
FROM ubuntu:16.04

RUN apt-get update

RUN apt-get update && apt-get install -y \
    default-jre \
	default-jdk \
	git \
	maven
	
RUN maven -version

RUN git clone https://github.com/RaniKubasad/RaniFirst.git

CMD ls

CMD ls 

RUN cd Rest-Assured && mvn test
	
	
	