package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameDescAndProrityDesc() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenCompatorByNameAscAndProrityAsc() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenAscCompatorByName() {
        Comparator<Job> cmpName = new JobAscByName();
        int result = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void whenDescCompatorByName() {
        Comparator<Job> cmpName = new JobDescByName();
        int result = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenAscCompatorByPriority() {
        Comparator<Job> cmpPriority = new JobAscByPriority();
        int result = cmpPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenDescCompatorByPriority() {
        Comparator<Job> cmpPriority = new JobDescByPriority();
        int result = cmpPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(result).isGreaterThan(0);
    }

}
