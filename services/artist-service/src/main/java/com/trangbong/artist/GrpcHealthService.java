package com.trangbong.artist;

import com.trangbong.grpc.HealthCheckReply;
import com.trangbong.grpc.HealthCheckRequest;
import com.trangbong.grpc.HealthGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GrpcHealthService extends HealthGrpc.HealthImplBase {

  @Override
  public void check(HealthCheckRequest request, StreamObserver<HealthCheckReply> responseObserver) {
    HealthCheckReply reply = HealthCheckReply.newBuilder()
        .setStatus("ok")
        .build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }
}
