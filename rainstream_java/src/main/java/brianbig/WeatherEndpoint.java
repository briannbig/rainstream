package brianbig;


import brianbig.gen.WeatherStream;
import brianbig.gen.WeatherStreamServiceGrpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class WeatherEndpoint extends WeatherStreamServiceGrpc.WeatherStreamServiceImplBase {

    final WeatherEngine weatherEngine;

    @Inject
    public WeatherEndpoint(WeatherEngine weatherEngine) {
        this.weatherEngine = weatherEngine;
    }

    @Override
    public void getInfoOnce(WeatherStream.WeatherRequest request, StreamObserver<WeatherStream.WeatherResponse> responseObserver) {
        responseObserver.onNext(weatherEngine.createInfo());

        responseObserver.onCompleted();
    }

    @Override
    public void getInfoContinuously(WeatherStream.WeatherRequest request, StreamObserver<WeatherStream.WeatherResponse> responseObserver) {
        weatherEngine.rainResponseStream.limit(request.getStreamLimit()).forEach(
                rainResponse -> {
                    try {
                        Thread.sleep(1000);
                        responseObserver.onNext(rainResponse);

                    } catch (InterruptedException e) {
                        responseObserver.onError(Status.INTERNAL.withCause(e).asRuntimeException());
                    }

                }
        );
        responseObserver.onCompleted();
    }


}
