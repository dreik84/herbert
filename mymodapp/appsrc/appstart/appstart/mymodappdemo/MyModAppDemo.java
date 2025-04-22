// Простой пример приложения, основанного на моделях
package appstart.mymodappdemo;

import java.util.ServiceLoader;

import appfuncs.simplefuncs.SimpleMathFuncs;
import appsupport.supportfuncs.SupportFuncs;
import userfuncs.binaryfuncs.*;

public class MyModAppDemo {
	public static void main(String[] args) {
		if (SupportFuncs.isFactor(2, 10))
			System.out.println("2 является делмтелем 10");

		System.out.println("Наименьший общий делитель для 35 и 105 равен " + 
				SimpleMathFuncs.lcf(35, 105));

		System.out.println("Наибольший общий делитель для 35 и 105 равен " +                                   SimpleMathFuncs.gcf(35, 105));

		// Получить загрузчик служб для бинарных функций
		ServiceLoader<BinFuncProvider> ldr = 
			ServiceLoader.load(BinFuncProvider.class);
		
		BinaryFunc binOp = null;

		// Найти поставщика для absPlus и получить функцию
		for (BinFuncProvider bfp : ldr) {
			if (bfp.get().getName().equals("absPlus") {
				binOp = bfp.get();
				break;
			}
		}

		if (binOp != null) 
			System.out.println("Результат выполнения функции absPlus: " + 
					binOp.func(12, -4));
		else System.out.println("Функция absPlus не найдена");

		binOp = null;

		// Найти поставщика для absMinus и получить функцию
                for (BinFuncProvider bfp : ldr) {
                        if (bfp.get().getName().equals("absMinus") {
                                binOp = bfp.get();
                                break;
                        }
                }

                if (binOp != null)
                        System.out.println("Результат выполнения функции absMinus: " +
                                        binOp.func(12, -4));
                else System.out.println("Функция absMinus не найдена");
	}
}
