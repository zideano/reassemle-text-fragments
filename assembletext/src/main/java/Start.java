public class Start {
    public static void main(String[] args) {

        if (args.length < 1) {
            throw new IllegalArgumentException("Enter a valid file");
        }

        AssembleTextFragment textFragment = new AssembleTextFragment();

        textFragment.assembledText(args[0]);
    }
}
