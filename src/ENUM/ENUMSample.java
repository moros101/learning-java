package ENUM;

public enum ENUMSample implements MyInterface {

    MONDAY(101, "1st day of the week"),
    TUESDAY(102, "2nd day of the week"),
    WEDNESDAY(103, "3rd day of the week"),
    THURSDAY(104, "4th day of the week"),
    FRIDAY(105, "5th day of the week"),
    SATURDAY(106, "6th day of the week"),
    SUNDAY(107, "7th day of the week"){
        @Override
        public void dummyMethod(){
            System.out.println("Sunday dummy method");
        }
    };

    private int val;
    private String comment;

    ENUMSample(int val, String comment){
        this.val = val;
        this.comment = comment;
    }

    public int getVal() {
        return val;
    }

    public String getComment() {
        return comment;
    }

    public static ENUMSample getEnumFromValue(int val) {
        for (ENUMSample sample : ENUMSample.values()) {
            if (sample.getVal() == val) {
                return sample;
            }
        }
        return null;
    }

    public void dummyMethod() {
        System.out.println("Default dummy method");
    }

    @Override
    public String toLowercase() {
        return this.name().toLowerCase();
    }
}
