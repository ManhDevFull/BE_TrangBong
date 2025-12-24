# TrangBong Backend

This backend workspace contains service skeletons and a Docker Compose setup to run everything locally.

## Run all services

From the BE directory:

```bash
cd BE
docker compose -f infra/docker-compose.yml up --build
```

Stop services:

```bash
docker compose -f infra/docker-compose.yml down
```

## Access

- Public (host): api-gateway at http://localhost:8080
- Internal HTTP: all services on port 8080 inside the Docker network
- Internal gRPC: all services on port 9090 inside the Docker network

Only the gateway is published to the host. Other services are internal-only.

Each service responds at HTTP `/` and `/health` and exposes gRPC `Health.Check`.
