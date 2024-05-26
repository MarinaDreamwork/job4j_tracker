package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class ItemDescByNameTest {
    @Test
    void whenSortByDescSuccess() {
        List<Item> items = Arrays.asList(new Item("write down aims"), new Item("read chapter of sorting"), new Item("add checklist"));
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(new Item("write down aims"), new Item("read chapter of sorting"), new Item("add checklist"));
        assertThat(items.get(0).getName()).isEqualTo(expected.get(0).getName());
    }

    @Test
    void whenSortByDescFail() {
        List<Item> items = Arrays.asList(new Item("write down aims"), new Item("read chapter of sorting"), new Item("add checklist"));
        List<Item> expected = Arrays.asList(new Item("add checklist"), new Item("read chapter of sorting"), new Item("write down aims"));
        assertThat(items.get(0).getName()).isNotEqualTo(expected.get(0).getName());
    }
}
