# TrangBong Backend

This backend workspace contains service skeletons and a Docker Compose setup to run everything locally.

## Run all services

From the BE directory:

`ash
cd BE
docker compose -f infra/docker-compose.yml up --build
`

Stop services:

`ash
docker compose -f infra/docker-compose.yml down
`

## Ports

- api-gateway: http://localhost:8080
- identity-service: http://localhost:8081
- customer-service: http://localhost:8082
- artist-service: http://localhost:8083
- catalog-service: http://localhost:8084
- scheduling-service: http://localhost:8085
- booking-service: http://localhost:8086
- payment-service: http://localhost:8087
- notification-service: http://localhost:8088
- fengshui-service: http://localhost:8089
- consultation-service: http://localhost:8090
- analytics-service: http://localhost:8091

Each service responds at / and /health.
