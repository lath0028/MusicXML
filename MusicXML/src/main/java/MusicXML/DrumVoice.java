package MusicXML;

public class DrumVoice {
	
	public DrumVoice() {
		// pass
	}
	
	int voice;
	
	
	public int FindVoiceValue (int row, int [] rowSymbols)
	{
		
		if (row == 100)
			voice = 0;
		
		else if (rowSymbols[row] == 8)
			voice = 2;
		
		else
			voice = 1;
	
		
		return voice;
		
	}
}

	