package ENUM;

public class main {
    public static void main(String[] args) {

        /*
            - has collection of CONSTANTS
            - CONSTANTS are static and final implicitly
            - Cant extend any class, internally extends java.lang.ENUM class
            - Can implement interfaces
            - Have variables, constructors,methods
            - Cant be initiated ( private constructor)
            - No other class can extend ENUM class
            - Can have abstract method, all constant implement that abstract method

            Common functions used
            - values()
            - ordinal()
            - valueOf()
            - name()
         */

        for(ENUMSample sample : ENUMSample.values()){
            System.out.println(sample.ordinal() + " => " + sample);
        }

        ENUMSample enumVariable = ENUMSample.valueOf("FRIDAY");
        System.out.println(enumVariable.name());

        ENUMSample sampleVar =  ENUMSample.getEnumFromValue(107);
        System.out.println(sampleVar.getComment());
        sampleVar.dummyMethod();
        System.out.println(sampleVar.toLowercase());

        // final class -> to avoid inheritance




    }
}


//[2025-07-25 16:25:37.293215] test.INFO: inside thirdPartySignUp dataarray is: {"accountNumber":"2883264368","accountPublicId":"f8061db8-812f-4356-92c2-94ee3270104f","addressLine":"stree5","apkName":"doroki","apkVersion":"2.0.0","autoGeneratePassword":0,"brandName":"WorkBusiness","businessUserPublicId":"71ed04e2-7579-40fc-bab7-e3a17343f997","chainIdentifier":"ABCD111","cityName":"Bego","companyName":"WorkBusiness","confirmPassword":"693294","country":"","email":"working@gmail.com","firstName":"Joe","industryIdentifier":"5818","lastName":"Doe","merchantCategoryCode":"5818","merchantCode":"bc41da19-6626-4697-a5b8-39f3ad1c13ce","merchantVisaId":"4891640000016243","mobile":"9058590585","partnerCode":"PAGA","partnerDeviceRefID":"693294","password":"693294","phoneCode":234,"pinKey":"","posTerminalId":"","secretKey":"","serialNumber":"37f85f5b38424e622578581014284bd2","signUpSource":"APP","storeName":"WorkBusiness","terminalId":"","username":"Working"} [] []

