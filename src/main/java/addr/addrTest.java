package addr;

import org.bitcoinj.core.ECKey;
import org.bitcoinj.fch.FchMainNetwork;
import org.bitcoinj.params.MainNetParams;

public class addrTest {
    public static void main(String[] args) {
        ECKey ecKey = new ECKey();
        System.out.println(ecKey.toAddress(MainNetParams.get()).toBase58());
        System.out.println(ecKey.toAddress(FchMainNetwork.MAINNETWORK).toBase58());
    }
}
