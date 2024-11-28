package com.example;

interface DataSource {
    String readData();
}

// Concrete Component
class FileDataSource implements DataSource {
    @Override
    public String readData() {
        return "Reading Data from File";
    }
}

// Decorator
class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    public DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}

// Concrete Decorator
class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public String readData() {
        return "Encrypted(" + super.readData() + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        DataSource source = new FileDataSource();
        DataSource encryptedSource = new EncryptionDecorator(source);

        System.out.println("Raw Data: " + source.readData());
        System.out.println("Decorated Data: " + encryptedSource.readData());
    }
}
