public class SalutationSetter {
    public static String setSalutation(String gender, String maritalStatus) {
        if (gender.equalsIgnoreCase("male")) {
            if (maritalStatus.equalsIgnoreCase("single")) {
                return "Mr.";
            } else if (maritalStatus.equalsIgnoreCase("married")) {
                return "Mr.";
            }
        } else if (gender.equalsIgnoreCase("female")) {
            if (maritalStatus.equalsIgnoreCase("single")) {
                return "Ms.";
            } else if (maritalStatus.equalsIgnoreCase("married")) {
                return "Mrs.";
            }
        }
        return "";
    }
}