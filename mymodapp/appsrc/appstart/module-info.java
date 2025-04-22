// Определение модуля главного приложения
module appstart {
	// Требует модуля appfuncs
	requires appfuncs;
	requires userfuncs;

	// appstart теперь использует BinFuncProvider
	uses userfuncs.binaryfuncs.BinFuncProvider;
}
