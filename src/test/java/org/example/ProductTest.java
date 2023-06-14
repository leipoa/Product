package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void testAdd() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Книга1", 300, "АвторКниги1");

        manager.add(book1);

        Product[] actual = repo.findAll();
        Product[] expected = {book1};

        Assertions.assertArrayEquals(expected, actual);
    }



}
