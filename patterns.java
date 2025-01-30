public class patterns {
git
	public static void p1(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i == 0 || i == (n-1) || j == 0 || j == (n-1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		} 
	}

	public static void p2(int n) {
		for(int i=1; i<=n ; i++){
			for(int j=0; j<(n-i); j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void p3(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i ;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void p4(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n-i+1) ;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void p5(int n) {
		int c = 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print((c++) + " ");
			}
			System.out.println();
		}
	}

	public static void p6(int n) {
		for(int i=1; i<=n; i++) {
			int c = i%2;
			for(int j=1; j<=i; j++) {
				System.out.print(c + " ");
				c = 1-c;
			}
			System.out.println();
		}
	}

	public static void p7(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=0; j<(n-i); j++) {
				System.out.print("  ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print(j + " ");
			}
			for(int j=2; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void p8(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=0; j<(n-i); j++) {
				System.out.print(" ");
			}
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void p9(int n) {
		boolean c = false;
		for(int i=1; i<=n && i>0; i++) {
			for(int j=0; j<(n-i); j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			if(i == n) { c = true; }
			if(c) { i = i-2;}
		}

		// for(int i=n-1; i>0; i--) {
		// 	for(int j=0; j<(n-i); j++) {
		// 		System.out.print(" ");
		// 	}
		// 	for(int j=0; j<i; j++) {
		// 		System.out.print("* ");
		// 	}
		// 	System.out.println();
		// }
	}

	public static void p10(int n) {
		boolean c = false;		int flag = 0;
		for(int i=1; i<=n && i>0; i = (c?--i:++i)) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			for(int j=0; j<2*(n-i) ; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();

			if(i == n && flag == 0) { i++;    c = true;    flag++;}
		}
	}

	public static void p11(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void p12(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void p13(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=0; j<=(n-i); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void p14(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=0; j<(n-i); j++) {
				System.out.print("  ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void p15(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("  ");
			}
			for(int j=0; j<=(n-i); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void p16(int n) {
		p13(n);

		for(int i=2; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void p17(int n) {
		for(int i=1; i<=n ; i++){
			for(int j=0; j<(n-i); j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void p18(int n) {
		for(int i=n; i>=1 ; i--){
			for(int j=0; j<(n-i); j++) {
				System.out.print(" ");
			}
			for(int j=(n-i+1); j<=n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void p19(int n) {
		p18(n);

		for(int i=2; i<=n ; i++){
			for(int j=0; j<(n-i); j++) {
				System.out.print(" ");
			}
			for(int j=(n-i+1); j<=n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void p20(int n) {
		for(int i=1; i<=n ; i++){
			for(int j=0; j<(n-i); j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				if(i==1 || i == (n) || j==0 || j==(i-1)) { System.out.print("* "); }
				else { System.out.print("  "); }
			}
			System.out.println();
		}
	}

	public static void p21(int n) {
		for(int i=n; i>=1 ; i--){
			for(int j=0; j<(n-i); j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				if(i==1 || i == (n) || j==0 || j==(i-1)) { System.out.print("* "); }
				else { System.out.print("  "); }
			}
			System.out.println();
		}
	}

	public static void p22(int n) {
		boolean c = false;
		for(int i=1; i<=n && i>0; i++) {
			for(int j=0; j<(n-i); j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				if(j==0 || j==(i-1)) { System.out.print("* "); }
				else { System.out.print("  "); }
			}
			System.out.println();
			if(i == n) { c = true; }
			if(c) { i = i-2;}
		}

		// for(int i=n-1; i>0; i--) {
		// 	for(int j=0; j<(n-i); j++) {
		// 		System.out.print(" ");
		// 	}
		// 	for(int j=0; j<i; j++) {
		// 		System.out.print("* ");
		// 	}
		// 	System.out.println();
		// }
	}

	public static void p23(int n) {
		boolean c = false;
		for(int i=n; i>=1 && i<=n ; i--){
			for(int j=0; j<(n-i); j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				if(i==n || i==1 || j==0 || j==(i-1)) { System.out.print("* "); }
				else { System.out.print("  "); }
			}
			System.out.println();
			if(i == 1) { c = true; }
			if(c) { i += 2; }
		}
	}

	public static void p24(int n) {
		for(int i=1; i<=n ; i++){
			for(int j=0; j<(n-i); j++) {
				System.out.print(" ");
			}
			for(int j=1, x=1; j<=i; j++) {
				System.out.print(x + " ");
                x = x * (i - j) / j;
			}
			System.out.println();
		}
	}


	public static void p25(int n) {
		for(int i=1; i<=n ; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n-1; i>=1 ; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[]args) {
		int n = 6;
		p1(n);
		System.out.println();
		p2(n);
		System.out.println();
		p3(n);
		System.out.println();
		p4(n);
		System.out.println();
		p5(n);
		System.out.println();
		p6(n);
		System.out.println();
		p7(n);
		System.out.println();
		p8(n);
		System.out.println();
		p9(n);
		System.out.println();
		p10(n);
		System.out.println();
		p11(n);
		System.out.println();
		p12(n);
		System.out.println();
		p13(n);
		System.out.println();
		p14(n);
		System.out.println();
		p15(n);
		System.out.println();
		p16(n);
		System.out.println();
		p17(n);
		System.out.println();
		p18(n);
		System.out.println();
		p19(n);
		System.out.println();
		p20(n);
		System.out.println();
		p21(n);
		System.out.println();
		p22(n);
		System.out.println();
		p23(n);
		System.out.println();
		p24(n-1);
		System.out.println();
		p25(n);
	}
}
