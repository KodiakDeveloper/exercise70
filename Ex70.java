package bookExercises;

import javax.swing.JOptionPane;

public class Ex70 {

	public static void main(String[] args) {

		int lines = 5, column = 5;

		int[] a = new int[5];

		int[] b = new int[5];

		int[] c = new int[5];

		int[] d = new int[5];

		int[] e = new int[5];

		int[][] f = new int[lines][column];

		int swap;

		String userAnswer;

		do {

			for (int i = 0; i < a.length; i++) {

				a[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Array A" + "\nIndex: " + i));
			}

			for (int i = 0; i < b.length; i++) {

				b[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Array B" + "\nIndex: " + i));
			}

			for (int i = 0; i < c.length; i++) {

				c[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Array C" + "\nIndex: " + i));
			}

			for (int i = 0; i < d.length; i++) {

				d[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Array D" + "\nIndex: " + i));
			}

			for (int i = 0; i < e.length; i++) {

				e[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Array E" + "\nIndex: " + i));
			}

			for (int i = 0; i < lines; i++) {

				f[i][0] = a[i];

				f[i][1] = b[i];

				f[i][2] = c[i];

				f[i][3] = d[i];

				f[i][4] = e[i];

			}

			for (int i = 0; i < lines; i++) {

				for (int j = i + 1; j < lines; j++) {

					if (f[i][0] > f[j][0]) {

						swap = f[i][0];

						f[i][0] = f[j][0];

						f[j][0] = swap;

					}

				}
			}

			for (int i = 0; i < lines; i++) {

				for (int j = i + 1; j < lines; j++) {

					if (f[i][1] > f[j][1]) {

						swap = f[i][1];

						f[i][1] = f[j][1];

						f[j][1] = swap;

					}

				}
			}

			for (int i = 0; i < lines; i++) {

				for (int j = i + 1; j < lines; j++) {

					if (f[i][2] > f[j][2]) {

						swap = f[i][2];

						f[i][2] = f[j][2];

						f[j][2] = swap;

					}

				}
			}

			for (int i = 0; i < lines; i++) {

				for (int j = i + 1; j < lines; j++) {

					if (f[i][3] > f[j][3]) {

						swap = f[i][3];

						f[i][3] = f[j][3];

						f[j][3] = swap;

					}

				}
			}

			for (int i = 0; i < lines; i++) {

				for (int j = i + 1; j < lines; j++) {

					if (f[i][4] > f[j][4]) {

						swap = f[i][4];

						f[i][4] = f[j][4];

						f[j][4] = swap;

					}

				}
			}

			System.out.println("-------------------");

			for (int i = 0; i < lines; i++) {

				for (int j = 0; j < column; j++) {

					System.out.print(f[i][j] + " | ");
				}

				System.out.println();
			}

			System.out.println("-------------------");

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!!");

	}

}
