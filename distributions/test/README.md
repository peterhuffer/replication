# Replication E2E Tests
Running the Replication end to end tests requires docker to be running locally and requires two nodes
to be running to replicate between them. The URLs of the nodes should be set in the environment variables
described below.

|Environment Variable | Description|
|------------|------------|
|REPLICATION_SRC| The base URL of the source node to use for testing.|
|REPLICATION_DEST| The base URL of the destination node to use for testing.|
