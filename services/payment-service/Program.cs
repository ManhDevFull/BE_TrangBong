var builder = WebApplication.CreateBuilder(args);

var app = builder.Build();

app.MapGet("/", () => "payment-service");
app.MapGet("/health", () => "ok");

app.Run();
