public class QuantumPhysics
{
    private boolean universe;
    private boolean baryonicMatter;
    private boolean darkMatter;
    private boolean determinationism;
    private int[] atoms;

    public QuantumPhysics(boolean universe, boolean baryonicMatter, boolean darkMatter, boolean determinationism, int[] atoms)
    {
        this.universe = universe;
        this.baryonicMatter = baryonicMatter;
        this.darkMatter = darkMatter;
        this.determinationism = determinationism;
        this.atoms = atoms;
    }
    public String canQuantum()
    {
        for(int i = 0; i < atoms.length; i++)
        {
            if(universe && baryonicMatter && darkMatter && determinationism && atoms.length >= 999999999999)
            {
            return "Quantum physics has been successfully simulated.";
            }
            else
            {
            return "Someone fucked up somewhere. Go back.";
            }
        }
    }
}