# otel-missing-logs
A simple reproducer that demonstrates that the OpenTelemetry extension is sending 
traces are sent to Jaeger but the trace id and span id is not outputted to the console log.

Start Jaeger locally with `docker compose up`

Start the application with `mvnw compile quarkus:dev`

Post a payload on the following form
`{"name": "YourName" }`
to the local lambda mock event server on http://localhost:8080/2015-03-31/functions/function/invocations

The log printed out has an empty traceId and spanId. :\
