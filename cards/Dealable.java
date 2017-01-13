package cards;

import java.util.*;
import enums.*;

public interface Dealable{
    public Suit getSuit();
    public Value getValue();
    public String getSummary();
}
