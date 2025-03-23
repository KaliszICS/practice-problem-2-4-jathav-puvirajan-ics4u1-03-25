public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void selectionSortName(String[] names, int[] ages){
		for(int i = 0; i < names.length - 1; i++){
			int sI = i;
			for(int j = i + 1; j < names.length; j++){
				if(names[sI].compareToIgnoreCase(names[j]) > 0){
					sI = j;
				}
			}

			String tempString = names[sI];
			int tempInt = ages[sI];
			names[sI] = names[i];
			ages[sI] = ages[i];
			names[i] = tempString;
			ages[i] = tempInt;
		}
	}
	public static void selectionSortAge(String[] names, int[] ages){
		for(int i = 0; i < names.length - 1; i++){
			int sI = i;
			for(int j = i + 1; j < names.length; j++){
				if(ages[sI] > ages[j]){
					sI = j;
				}
			}

			String tempString = names[sI];
			int tempInt = ages[sI];
			names[sI] = names[i];
			ages[sI] = ages[i];
			names[i] = tempString;
			ages[i] = tempInt;
		}
	}

}
