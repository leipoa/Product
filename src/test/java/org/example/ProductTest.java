package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void testAdd() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Книга1", 300, "Автор1");
        Smartphone smartphone1 =new Smartphone(2,"Смартфон1", 50_000, "Марка1");

        manager.add(book1);
        manager.add((smartphone1));

        Product[] actual = repo.findAll();
        Product[] expected = {book1, smartphone1};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testSearchBy(){
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Книга1", 300, "Автор1");
        Book book2 = new Book(2, "Книга2", 250, "Автор2");

        manager.add(book1);
        manager.add(book2);

        Product[] actual = manager.searchBy("2");
        Product[] expected = {book2};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testRemoveById() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smartphone smartphone1 = new Smartphone(2, "Смартфон1", 50_000, "Марка1");
        Smartphone smartphone2 = new Smartphone(3, "Смартфон2", 70_000, "Марка2");

        repo.add(smartphone1);
        repo.add(smartphone2);
        repo.removeById(2);

        Product[] actual = repo.findAll();
        Product[] expected = {smartphone2};

        Assertions.assertArrayEquals(expected, actual);


    }
}







