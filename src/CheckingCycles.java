public class CheckingCycles implements Checker {
    private static final String ALLOWED_CHARACTERS = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789_";


    @Override
    public boolean check(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!ALLOWED_CHARACTERS.contains(Character.toString(chars[i]))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid(String s) {
        return false;
    }
}
