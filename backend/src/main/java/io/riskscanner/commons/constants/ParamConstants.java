package io.riskscanner.commons.constants;


public interface ParamConstants {

    String getValue();

    enum Type implements ParamConstants {

        PASSWORD("password"),
        TEXT("text"),
        JSON("json");

        private String value;

        Type(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    enum Classify implements ParamConstants {
        MAIL("smtp"),
        LDAP("ldap"),
        MESSAGE("message"),
        REGISTRY("registry");

        private String value;

        Classify(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }


    enum Registry implements ParamConstants {
        URL("registry.url"),
        REPO("registry.repo"),
        USERNAME("registry.username"),
        PASSWORD("registry.password");

        private String value;

        Registry(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

    enum I18n implements ParamConstants {

        LANGUAGE("i18n.language");

        private String value;

        I18n(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    enum MAIL {
        SERVER("smtp.server", 1),
        PORT("smtp.port", 2),
        ACCOUNT("smtp.account", 3),
        PASSWORD("smtp.password", 4),
        SSL("smtp.ssl", 5),
        TLS("smtp.tls", 6),
        SMTP("smtp.smtp", 7);
//        ANON("smtp.anon", 8);

        private String key;
        private Integer value;

        private MAIL(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return this.key;
        }

        public Integer getValue() {
            return this.value;
        }
    }

    enum LDAP implements ParamConstants {
        URL("ldap.url"),
        DN("ldap.dn"),
        PASSWORD("ldap.password"),
        OU("ldap.ou"),
        FILTER("ldap.filter"),
        MAPPING("ldap.mapping"),
        OPEN("ldap.open");

        private String value;

        LDAP(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

    enum MEAASGE {
        SERVER("meaasge.title", 1),
        PORT("smtp.recipient", 2),
        ACCOUNT("smtp.mails", 3),
        PASSWORD("smtp.mailContent", 4),
        SSL("smtp.textContent", 5),
        TLS("smtp.messageType", 6),
        SMTP("smtp.triggerAction", 7);

        private String key;
        private Integer value;

        private MEAASGE(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return this.key;
        }

        public Integer getValue() {
            return this.value;
        }
    }

    public static String CanNotBeNull = "Value for condition cannot be null";
    public static String ValueFor = "Value for ";
    public static String CanNotNull = " cannot be null";
    public static String BetweenValuesFor = "Between values for ";
}
