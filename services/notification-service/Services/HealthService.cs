using Grpc.Core;
using TrangBong.Grpc;

namespace NotificationService;

public class HealthService : Health.HealthBase
{
    public override Task<HealthCheckReply> Check(HealthCheckRequest request, ServerCallContext context)
    {
        return Task.FromResult(new HealthCheckReply { Status = "ok" });
    }
}
