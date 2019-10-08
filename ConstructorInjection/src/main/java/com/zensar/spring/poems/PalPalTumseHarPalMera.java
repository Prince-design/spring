package com.zensar.spring.poems;

public class PalPalTumseHarPalMera implements Poem {
	private static final String LINES[] = { "Pal pal tumse har pal mera", "Jane kya hoga kal mera",
			"Tumse hi hai naya savera", "Na ho to hai ghor andhera", "Pal pal tumse har pal mera",
			"Jane kya hoga kal mera", "Tum aayi to jeevan chehka", "Antarman ka har kona mehka",
			"Tum hi se hai jeevan mera", "Pal pal tumse har pal mera", "Jane kya hoga kal mera",
			"Tumse hi dil karta dhak-dhak", "Tumse hi hai saansein mujhme", "Tum hi se pagalpan mera",
			"Pal pal tumse har pal mera", "Jane kya hoga kal mera", "Jana na tum chod ke mujhko",
			"Mar jaunga sach kehta hoon", "Tum hi se har ek din mera", "Pal pal tumse har pal mera",
			"Jane kya hoga kal mera" };

	@Override
	public void recite() {
		// TODO Auto-generated method stub
		for (String line : LINES) {
			System.out.println(line);
		}
	}

}
