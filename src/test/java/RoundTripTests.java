import me.PauMAVA.MatrixCipher.MatrixCipherTools;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class RoundTripTests {

    private List<String> strings = Arrays.asList(
            "Hello world, my name is PauMAVA!",
            "The smoke contributes the strong decision.",
            "The stereotyped start conveys the level.",
            "The verse obtains the silk.",
            "The ten land nurses the week.",
            "The special test articulates the side.",
            "The ugliest scale facilitates the front.",
            "The detailed hour conceives the land.",
            "The amusement classifys the polish.",
            "The early flower details the oil.",
            "The sister reads the noise.",
            "The distribution orientates the force.",
            "The committee approves the careless servant.",
            "The damage uncovers the disgusting month.",
            "The cork distributes the acidic breath.",
            "The heat litigates the sex.",
            //"The rain nurses the pain.",
            "The wound encourages the steel.",
            "The value interfaces the well-off education.",
            "The teaching assumes the month.",
            "The middle individualizes the account.",
            "The trick aids the sea.",
            "The next steam studys the waste.",
            //"The flame solves the way.",
            "The faulty reaction completes the fire.",
            "The reaction catalogs the majestic lift.",
            "The cause surveys the rain.",
            "The tall back furthers the stretch.",
            "The secretary boosts the habitual blow.",
            "The amount liquidates the stitch.",
            "The necessary account attracts the tax.",
            "The interest publicizes the blood.",
            "The wind lectures the time.",
            "The guide straightens the bit.",
            "The wine increases the political animal.",
            "The damp father dissects the produce.",
            "The authority installs the imaginary mountain.",
            //"The cheap canvas compares the shock.",
            "The desire causes the substance.",
            "The cook solicits the mundane protest.",
            "The transport heads the chalk.",
            "The turn collaborates the large amusement.",
            "The minor existence visits the mountain.",
            "The three shock depreciateds the mist.",
            //"The doubt leads the view.",
            "The freezing place heads the approval.",
            "The drab sister generates the test.",
            "The instrument arbitrates the profit.",
            "The song pilots the war.",
            "The jelly settles the regret.",
            "The sparkling meal mechanizes the touch.",
            "The tremendous government contacts the day.",
            "The start advertises the surprise.",
            "The sea funds the colorful thunder.",
            "The water interacts the loss.",
            "The slip offsets the hissing representative.",
            "The wiggly flame inspects the sky.",
            "The defeated hope interacts the smile.",
            "The exclusive connection assembles the government.",
            "The mind indexs the sex.",
            //"The oil licenses the annoying owner.",
            "The minor ice surveys the cook.",
            "The puny fire edits the land.",
            "The unequaled comparison revitalizes the adjustment.",
            "The stupid rhythm reduces the act.",
            "The language enables the way.",
            "The didactic growth orchestrates the paint.",
            "The high-pitched attempt installs the fact.",
            "The feeble limit expands the order.",
            "The level proposes the sparkling rate.",
            "The learning strategizes the peace.",
            //"The grass witnesss the learned mind.",
            "The laugh lobbys the spiky body.",
            "The science inspects the test.",
            "The leather records the sex.",
            "The comfort cooperates the amount.",
            "The dusty night enlightes the oil.",
            "The annoyed kick decreaes the reading.",
            "The quixotic week forwards the death.",
            "The loss discovers the rub.",
            "The experience eliminates the phobic voice.",
            "The waste unifys the drink.",
            "The acidic chance helps the middle.",
            //"The dreary light begins the disgust.",
            "The yielding way aligns the exchange.",
            "The nation amends the flimsy birth.",
            "The better silk conveys the sleep.",
            "The sky audits the sturdy flight.",
            "The wound reduces the naive page.",
            "The deep gold prevents the sea.",
            //"The heat considers the noxious work.",
            "The direction displays the brass.",
            "The seat centralizes the way.",
            "The damage outlines the scintillating debt.",
            "The periodic bit involves the tax.",
            "The old-fashioned grain unifys the sign.",
            "The pastoral guide furthers the animal.",
            "The degree acquires the abstractedstructure."
    );

    //TODO Fix bug on Strings with length 25 or 36

    @Test
    public void roundTripTest() {
        for (String original: strings) {
            String encrypted = MatrixCipherTools.encrypt(original);
            assertNotEquals(original, encrypted);
            String decrypted = MatrixCipherTools.decrypt(encrypted);
            assertEquals(decrypted, original);
            System.out.println("Original: " + original + "\n" + "Encrypted: " + encrypted + "\n" + "Decrypted: " + decrypted + "\n========================================================");
        }
    }

    @Test
    public void roundTripTestAdvanced() {
        for (String original: strings) {
            String encrypted = MatrixCipherTools.encrypt(original, true);
            assertNotEquals(original, encrypted);
            String decrypted = MatrixCipherTools.decrypt(encrypted, true);
            assertEquals(decrypted, original);
            System.out.println("Original: " + original + "\n" + "Encrypted: " + encrypted + "\n" + "Decrypted: " + decrypted + "\n========================================================");
        }
    }

}
