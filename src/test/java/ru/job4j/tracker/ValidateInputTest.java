package ru.job4j.tracker;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ValidateInputTest {
    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"0"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(0);
    }

    @Test
    void whenValidInputs() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"1", "2", "0", "3"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int firstSelected = input.askInt("Enter menu:");
        assertThat(firstSelected).isEqualTo(1);
        int secondSelected = input.askInt("Enter menu:");
        assertThat(secondSelected).isEqualTo(2);
        int thirdSelected = input.askInt("Enter menu:");
        assertThat(thirdSelected).isEqualTo(0);
        int fourthSelected = input.askInt("Enter menu:");
        assertThat(fourthSelected).isEqualTo(3);
    }

    @Test
    void whenMinusInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"-5"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-5);
    }
}