import java.io.File; import java.io.FileInputStream; import java.util.LinkedHashMap; import java.util.Map.Entry;
import org.biojava.nbio.core.sequence.ProteinSequence; import org.biojava.nbio.core.sequence.compound.AminoAcidCompound; import org.biojava.nbio.core.sequence.compound.AminoAcidCompoundSet; import org.biojava.nbio.core.sequence.io.FastaReader; import org.biojava.nbio.core.sequence.io.FastaReaderHelper; import org.biojava.nbio.core.sequence.io.GenericFastaHeaderParser; import org.biojava.nbio.core.sequence.io.ProteinSequenceCreator;

public class main {

    public static void main(String[] args) throws Exception{
       /*
        * Method 1: With the FastaReaderHelper
        */
        //Try with the FastaReaderHelper
        LinkedHashMap<String, ProteinSequence> a = FastaReaderHelper.readFastaProteinSequence(new File("/home/marc/IdeaProjects/DynamiteAndButterflies/out.fa"));
        //FastaReaderHelper.readFastaDNASequence for DNA sequences

        for (  Entry<String, ProteinSequence> entry : a.entrySet() ) {
            System.out.println( entry.getValue().getOriginalHeader() + "=" + entry.getValue().getSequenceAsString() );
        }
    }

}