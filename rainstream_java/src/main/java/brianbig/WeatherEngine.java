package brianbig;

import brianbig.gen.WeatherStream;
import com.github.javafaker.Faker;
import jakarta.inject.Singleton;

import java.util.stream.Stream;

@Singleton
public class WeatherEngine {

    final Faker faker = new Faker();
    Stream<WeatherStream.WeatherResponse> rainResponseStream;

    WeatherEngine() {

        rainResponseStream = Stream.generate(this::createInfo);

    }


    WeatherStream.WeatherResponse createInfo() {
        return WeatherStream.WeatherResponse.newBuilder()
                .setCity(faker.country().capital())
                .setInfo(faker.weather().description())
                .build();

    }
}

