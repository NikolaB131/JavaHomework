package pr12;

public class PhoneConverter {
    public static String convert(String phoneNumber) {
        StringBuilder sb = new StringBuilder();
        if (phoneNumber.charAt(0) == '+' && phoneNumber.length() == 12) {
            sb.append(phoneNumber.substring(0, 2))
                    .append('(').append(phoneNumber.substring(2, 5)).append(')')
                    .append(phoneNumber.substring(5, 8))
                    .append('-').append(phoneNumber.substring(8, 10))
                    .append('-').append(phoneNumber.substring(10, 12));
        } else if (phoneNumber.charAt(0) == '8' && phoneNumber.length() == 11) {
            sb.append("+7")
                    .append('(').append(phoneNumber.substring(1, 4)).append(')')
                    .append(phoneNumber.substring(4, 7))
                    .append('-').append(phoneNumber.substring(7, 9))
                    .append('-').append(phoneNumber.substring(9, 11));
        }
        return sb.toString();
    }
}
