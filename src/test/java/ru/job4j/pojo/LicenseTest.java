package ru.job4j.pojo;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LicenseTest {
    @Test
    public void eqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first).isEqualTo(second);
    }
}