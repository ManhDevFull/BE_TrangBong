var builder = WebApplication.CreateBuilder(args);

var app = builder.Build();

app.MapGet("/", () => "booking-service");
app.MapGet("/health", () => "ok");

app.Run();
