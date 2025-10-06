type SearchFormProps = {
  city: string
  setCity: (city: string) => void
  onSearch: () => void
}

function SearchForm({ city, setCity, onSearch }: SearchFormProps) {
  return (
    <>
      <input type="text" value={city} placeholder="都市名" className="searchBox" onChange={(e) => {setCity(e.target.value)}}/>
      <button className="searchButton" onClick={onSearch}>検索</button>
    </>
  )
}

export default SearchForm