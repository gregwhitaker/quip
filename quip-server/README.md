# quip-server

An HTTP echo server for testing.

## Building quip-server
You can build quip-server as a Docker container by running the following command:

    $ ./gradlew clean buildImage

## Running quip-server
You can start quip-server as a Docker container by running the following command:

    # docker run -p 5050:5050 {IMAGE ID}
