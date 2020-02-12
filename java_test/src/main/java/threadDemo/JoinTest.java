package threadDemo;

/**
 * @program: test
 * author: dudy
 * create: 2020-02-12 10:58
 * description:
 **/
public class JoinTest {
	static class Lucy implements Runnable {
		private Thread thread;
		public Lucy(Thread thread) {
			this.thread = thread;
		}
		public void run() {
			System.out.println("lucy 开始打饭");
			try {
				if (thread != null) thread.join();
			} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + " ,lucy打饭完成");
		}
	}
	static class LucyBoyFriend implements Runnable {
		public void run() {
			System.out.println("Lucy's BoyFriend 开始打饭");
			System.out.println(Thread.currentThread().getName() + " ,lucy's boyfriend打饭完成");
		}
	}
	public static void main(String[] args) throws Exception{
		LucyBoyFriend lucyBoyFriend = new LucyBoyFriend();
		Thread lucybf = new Thread(lucyBoyFriend);
		Lucy lucy = new Lucy(lucybf); // 创建lucy时指定Thread，让Thread优先于lucy线程执行
		Thread lucyTh = new Thread(lucy);
		lucybf.start();
		lucyTh.start();
		lucyTh.join(); // lucyTh优先于main线程运行
		System.out.println("me 开始打饭");
		System.out.println(Thread.currentThread().getName() + ", me打饭完成");
	}
}
