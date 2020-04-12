package Terator;

public class TCLTelevision implements Television{
	private Object[] obj = {"湖南卫视", "北京卫视"};

	public TVIterator createIterator() {
		return new TCLIterator();
	}
	
	class TCLIterator implements TVIterator{
		
		private int currentIndex = 0;
		
		public void setChannel(int i) {
			currentIndex = i;
		}

		public void next() {
			if(currentIndex < obj.length) {
				currentIndex++;
			}
		}

		public void previous() {
			if(currentIndex > 0) {
				currentIndex--;
			}
		}

		public boolean isLast() {
			return currentIndex == obj.length;
		}

		public Object currentChannel() {
			return obj[currentIndex];
		}

		public boolean isFirst() {
			return currentIndex == 0;
		}
	}
}
