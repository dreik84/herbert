// Определение модуля математических функций
open module appfuncs {
	// Экспортировать пакет
	exports appfuncs.simplefuncs;

	// Сделать модуль appsupport транзитивным
	requires transitive appsupport;
}
