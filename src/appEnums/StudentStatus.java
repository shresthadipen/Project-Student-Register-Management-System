package appEnums;

public enum StudentStatus {
    ACTIVE("ACTIVE"), DEACTIVATE("DEACTIVATE");

    private String key;

    StudentStatus(String key) {
        this.key = key;
    }

    public String getKey() {
        return this.key;
    }

}
