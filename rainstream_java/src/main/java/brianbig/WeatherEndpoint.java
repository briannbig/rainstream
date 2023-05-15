package brianbig;


import brianbig.gen.WeatherStream;
import brianbig.gen.WeatherStreamServiceGrpc;
import com.github.javafaker.Faker;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import jakarta.inject.Singleton;

@Singleton
public class WeatherEndpoint extends WeatherStreamServiceGrpc.WeatherStreamServiceImplBase {

    final Faker faker = new Faker();




    @Override
    public void getInfoOnce(WeatherStream.WeatherRequest request, StreamObserver<WeatherStream.WeatherResponse> responseObserver) {
        responseObserver.onNext(createInfo());

        responseObserver.onCompleted();
    }

    @Override
    public void getInfoContinuously(WeatherStream.WeatherRequest request, StreamObserver<WeatherStream.WeatherResponse> responseObserver) {

        for (int i = 0; i < request.getStreamLimit(); i++) {
            try{
                Thread.sleep(1000);
            responseObserver.onNext(createInfo());} catch (InterruptedException e) {
                responseObserver.onError(Status.INTERNAL.withCause(e).asRuntimeException());
            }

        }
        responseObserver.onCompleted();
    }


    private WeatherStream.WeatherResponse createInfo() {
        return WeatherStream.WeatherResponse.newBuilder()
                .setCity(faker.country().capital())
                .setInfo(faker.weather().description())
                .build();

    }
}
