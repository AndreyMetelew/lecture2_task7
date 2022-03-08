package com.task7;

public class Main {

    /* 1. Создать класс Friend (друг) тремя конструкторами:
    - Имя
    - Имя, возраст
    - Имя, возраст, пол */

    public class Friend {
        private String name;
        private int age;
        private boolean gender;

        public Friend (String name)
        {
            this.name = name;
        }

        public Friend (String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Friend (String name, int age, boolean gender)
        {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
    }

    /* 2. Создать класс Cat (кот) с пятью конструкторами:
    - Имя
    - Имя, вес, возраст
    - Имя, возраст (вес стандартный)
    - вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
    - вес, цвет, адрес (чужой домашний кот) */

    public class Cat {
        private String name = null, address = null, color;
        private int age = 4, weight = 4;

        public Cat (String name)
        {
            this.name = name;
        }

        public Cat (String name, int weight, int age)
        {
            this.name = name;
            this.weight = weight;
            this.age = age;
        }

        public Cat (String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Cat (int weight, String color)
        {
            this.weight = weight;
            this.color = color;
        }

        public Cat (int weight, String color, String address)
        {
            this.weight = weight;
            this.color = color;
            this.address = address;
        }
    }

    /* 3. Создать класс Dog (собака) с тремя конструкторами:
    - Имя
    - Имя, рост
    - Имя, рост, цвет */

    public class Dog {
        String name = null, color;
        int height = 40;

        public Dog (String name)
        {
            this.name = name;
        }

        public Dog (String name, int height)
        {
            this.name = name;
            this.height = height;
        }

        public Dog (String name, int height, String color)
        {
            this.name = name;
            this.height = height;
            this.color = color;
        }
    }

    /* 4. Создать класс (Circle) круг, с тремя конструкторами:
    - centerX, centerY, radius
    - centerX, centerY, radius, width
    - centerX, centerY, radius, width, color */

    public class Circle {
        int centerX, centerY, radius, width;
        String color;

        public Circle (int centerX, int centerY, int radius)
        {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
        }

        public Circle (int centerX, int centerY, int radius, int width)
        {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.width = width;
        }

        public Circle (int centerX, int centerY, int radius, int width, String color)
        {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.width = width;
            this.color = color;
        }
    }

    /* 5. Создать класс прямоугольник (Rectangle).
    Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
    Создать для него как можно больше конструкторов */

    public class Rectangle {
        int top, left, width, height;

        public Rectangle (int left, int top, int width, int height)
        {
            this.top = top;
            this.left = left;
            this.width = width;
            this.height = height;
        }

        public Rectangle (int left, int top)
        {
            this.top = top;
            this.left = left;
            width = 0;
            height = 0;
        }

        public Rectangle (int left, int top, int width)
        {
            this.top = top;
            this.left = left;
            this.width = width;
            height = width;
        }

        public Rectangle (Rectangle rectangle, int left, int top, int width, int height)
        {
            rectangle.left = this.left;
            rectangle.top = this.top;
            rectangle.width = this.width;
            rectangle.height = this.width;
        }

        public Rectangle ()
        {
            top = 0;
            left = 0;
            width = 1;
            height = 1;
        }

        public Rectangle (int width)
        {
            top = 0;
            left = 0;
            this.width = width;
            height = width;
        }
    }

    public static void main(String[] args) {
        // Меня надо было бы заполнить, но в заданиях ничего про выведение не было. Такие дела :)
    }
}