var builder = WebApplication.CreateBuilder(args);

var app = builder.Build();

app.MapGet("/", () => "analytics-service");
app.MapGet("/health", () => "ok");

app.Run();
