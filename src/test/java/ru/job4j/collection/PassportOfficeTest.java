package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PassportOfficeTest {
    @Test
    public void whenTestAddMethodTrue() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenTestAddMethodIsFalse() {
        Citizen citizen = new Citizen("65Ikdc4", "Max Maximov");
        Citizen anotherCitizen = new Citizen("65Ikdc4", "Ivan Ivanov");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.add(anotherCitizen)).isFalse();
    }

    @Test
    public void whenTestAddMethodIsTrue() {
        Citizen citizen = new Citizen("65Ikdc4", "Max Maximov");
        Citizen anotherCitizen = new Citizen("328Jg", "Ivan Ivanov");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.add(anotherCitizen)).isTrue();
    }
}