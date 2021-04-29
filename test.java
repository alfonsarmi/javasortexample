
/*
 * 		file.Classes[0].Name	"Principal"	string
-		file.Operands	Count = 138	System.Collections.Generic.List<string>
		[0]	"package"	string
		[1]	"com"	string
		[2]	"."	string
		[3]	"arquitecturajava"	string
		[4]	";"	string
		[5]	"import"	string
		[6]	"java"	string
		[7]	"."	string
		[8]	"util"	string
		[9]	"."	string
		[10]	"ArrayList"	string
		[11]	";"	string
		[12]	"import"	string
		[13]	"java"	string
		[14]	"."	string
		[15]	"util"	string
		[16]	"."	string
		[17]	"Collections"	string
		[18]	";"	string
		[19]	"import"	string
		[20]	"java"	string
		[21]	"."	string
		[22]	"util"	string
		[23]	"."	string
		[24]	"Comparator"	string
		[25]	";"	string
		[26]	"public"	string
		[27]	"class"	string
		[28]	"Principal"	string
		[29]	"{"	string
		[30]	"public"	string
		[31]	"static"	string
		[32]	"void"	string
		[33]	"main"	string
		[34]	"("	string
		[35]	"String"	string
		[36]	"["	string
		[37]	"]"	string
		[38]	"args"	string
		[39]	")"	string
		[40]	"{"	string
		[41]	"ArrayList"	string
		[42]	"Persona"	string
		[43]	"milista"	string
		[44]	"new"	string
		[45]	"ArrayList"	string
		[46]	"Persona"	string
		[47]	"("	string
		[48]	")"	string
		[49]	";"	string
		[50]	"milista"	string
		[51]	"."	string
		[52]	"add"	string
		[53]	"("	string
		[54]	"new"	string
		[55]	"Persona"	string
		[56]	"("	string
		[57]	"\"Miguel\""	string
		[58]	")"	string
		[59]	")"	string
		[60]	";"	string
		[61]	"milista"	string
		[62]	"."	string
		[63]	"add"	string
		[64]	"("	string
		[65]	"new"	string
		[66]	"Persona"	string
		[67]	"("	string
		[68]	"\"Alicia\""	string
		[69]	")"	string
		[70]	")"	string
		[71]	";"	string
		[72]	"Collections"	string
		[73]	"."	string
		[74]	"sort"	string
		[75]	"("	string
		[76]	"milista"	string
		[77]	","	string
		[78]	"new"	string
		[79]	"Comparator"	string
		[80]	"Persona"	string
		[81]	"("	string
		[82]	")"	string
		[83]	"{"	string
		[84]	"public"	string
		[85]	"int"	string
		[86]	"compare"	string
		[87]	"("	string
		[88]	"Persona"	string
		[89]	"p1"	string
		[90]	","	string
		[91]	"Persona"	string
		[92]	"p2"	string
		[93]	")"	string
		[94]	"{"	string
		[95]	"return"	string
		[96]	"p1"	string
		[97]	"."	string
		[98]	"getNombre"	string
		[99]	"("	string
		[100]	")"	string
		[101]	"."	string
		[102]	"compareTo"	string
		[103]	"("	string
		[104]	"p2"	string
		[105]	"."	string
		[106]	"getNombre"	string
		[107]	"("	string
		[108]	")"	string
		[109]	")"	string
		[110]	";"	string
		[111]	"}"	string
		[112]	"}"	string
		[113]	")"	string
		[114]	";"	string
		[115]	"("	string
		[116]	"Persona"	string
		[117]	"p"	string
		[118]	":"	string
		[119]	"milista"	string
		[120]	")"	string
		[121]	"{"	string
		[122]	"System"	string
		[123]	"."	string
		[124]	"out"	string
		[125]	"."	string
		[126]	"println"	string
		[127]	"("	string
		[128]	"p"	string
		[129]	"."	string
		[130]	"getNombre"	string
		[131]	"("	string
		[132]	")"	string
		[133]	")"	string
		[134]	";"	string
		[135]	"}"	string
		[136]	"}"	string
		[137]	"}"	string
+		Raw View		
-		file.Operators	Count = 8	System.Collections.Generic.List<string>
		[0]	"<"	string
		[1]	">"	string
		[2]	"="	string
		[3]	"<"	string
		[4]	">"	string
		[5]	"<"	string
		[6]	">"	string
		[7]	"for"	string

		BM_CognitiveComplexity	2	double
		BM_CouplingBetweenObjectClasses	0	double
		BM_CyclomaticComplexity	1	double
		BM_DepthOfInheritance	0	int
		BM_EffectiveComplexityScoreLogicalComplexity	0	double
		BM_EffectiveComplexityScoreRelations	0	double
		BM_EffectiveComplexityScoreSoftwareScience	0	double
		BM_HalsteadNumOperands	107	double
		BM_HalsteadNumOperators	8	double
		BM_HalsteadNumUniqueOperands	37	double
		BM_HalsteadNumUniqueOperators	4	double
		BM_InherentComplexityScoreLogicalComplexity	0	double
		BM_InherentComplexityScoreRelations	0	double
		BM_InherentComplexityScoreSoftwareScience	0	double
		BM_LackOfCohesion	1	double
		BM_LinesOfCode	15	int
		BM_LinesOfComments	0	int
		BM_LinesPseudoDeleted	0	int
		BM_NestingDepth	1	int
		BM_Size	440	long

 */
package com.arquitecturajava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Persona> milista = new ArrayList<Persona>();
		milista.add(new Persona("Miguel"));
		milista.add(new Persona("Alicia"));
		milista.add(new Persona("Alicia"));
		milista.add(new Persona("Alicia"));
		milista.add(new Persona("Alicia"));
		milista.add(new Persona("Alicia"));
		milista.add(new Persona("Alicia"));
		milista.add(new Persona("Alicia"));
		milista.add(new Persona("Alicia"));
		milista.add(new Persona("Alicia"));
		milista.add(new Persona("Alicia"));
		milista.add(new Persona("Alicia"));
		milista.add(new Persona("Alicia"));
		milista.add(new Persona("Alicia"));
		milista.add(new Persona("Alicia"));
		milista.add(new Persona("Alicia"));
		milista.add(new Persona("Alicia"));
		milista.add(new Persona("Alicia"));
		milista.add(new Persona("Alicia"));
		milista.add(new Persona("Alicia"));
		milista.add(new Persona("Alicia"));
		milista.add(new Persona("Alicia"));
//Test2
		Collections.sort(milista, new Comparator<Persona>() {

			public int compare(Persona p1, Persona p2) {

				return p1.getNombre().compareTo(p2.getNombre());
				//Test3
			}

		});

		for (Persona p : milista) {

			System.out.println(p.getNombre());

		}
	}

}
